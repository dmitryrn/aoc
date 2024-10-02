package aoc

import sttp.client4.quick.*
import sttp.client4.Response
import sttp.client4.SpecifyAuthScheme
import sttp.model.Header

object Fetcher {
  def fetch(day: Int, token: String): String = {
    // https://adventofcode.com/2022/day/1/input
    
    val response = quickRequest
      .withHeaders(List{Header("Cookie", "session="+token)})
      .get(uri"https://adventofcode.com/2022/day/${day}/input")
      .send()

    response.body
  }
}
