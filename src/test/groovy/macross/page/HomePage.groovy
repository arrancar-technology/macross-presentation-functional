package macross.page

import macross.page.module.SearchPanel
import macross.path.PathPresentation

class HomePage extends BasePage {

  static url = PathPresentation.BASE
  static at = { title == "Lyrx.io - Home of Lyrics" }

  static content = {
    searchPanel { module SearchPanel, $('.searchPanel') }
  }
}
