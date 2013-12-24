package macross.spec.rendering

import macross.page.HomePage
import macross.path.PathFixture
import macross.spec.BaseSpecification

class HomePageSpec extends BaseSpecification {

  def "Homepage renders correctly"() {
    given:
      presentation.get(path: PathFixture.RESET)

    when:
      toAt HomePage

    then:
      locationField.displayed
      locationField.@placeholder == 'Enter your town/postcode'
  }
}
