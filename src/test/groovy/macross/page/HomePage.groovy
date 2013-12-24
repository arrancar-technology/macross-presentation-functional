package macross.page

import macross.path.PathPresentation

class HomePage extends BasePage {

  static url = PathPresentation.BASE
  static at = { title == "Welcome to macross presentation" }

  static content = {
    locationField { $('.location') }
  }
}
