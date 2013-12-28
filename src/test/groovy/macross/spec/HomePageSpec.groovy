package macross.spec

import groovyx.net.http.ContentType
import macross.page.HomePage
import macross.page.ResultTypes
import macross.page.SearchResultsPage
import macross.path.PathFixture
import spock.lang.Ignore

class HomePageSpec extends BaseSpecification {

  def "Homepage renders correctly"() {
    given:
      presentation.get(path: PathFixture.RESET)

    when:
      to HomePage

    then:
      at HomePage
  }

  @Ignore
  def "user can search and see no results message"() {}

  def "user can search and see the search results"() {
    given:
    presentation.post(path: PathFixture.SONG,
                      body: [ name: 'skip to the good bit', lyrics:'skip it' ],
                      requestContentType: ContentType.JSON)

    when:
    to HomePage

    and:
    searchPanel.searchBox = "good bit"
    searchPanel.searchButton.click()

    then:
    at SearchResultsPage
    title.endsWith("good bit")
    results(ResultTypes.SONG.name).header.text() == 'Songs'
    results(ResultTypes.SONG.name).rows.size() == 1
    results(ResultTypes.SONG.name).rows[0].cells[0].text() == 'skip to the good bit'


// TODO[DK]: to be implemented as next step
//    when:
//    results.results(ResultTypes.SONG.name).click()
//
//    then:
//    at SongDetailsPage
//
//    and:
//    lyricsPanel.text() == 'skip it...'
  }
}
