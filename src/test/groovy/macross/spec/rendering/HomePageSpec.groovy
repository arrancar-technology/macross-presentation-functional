package macross.spec.rendering

import macross.page.HomePage
import macross.path.PathFixture
import macross.spec.BaseSpecification

class HomePageSpec extends BaseSpecification {

  def "Homepage renders correctly"() {
    when:
      to HomePage

    then:
      at HomePage
  }
}
