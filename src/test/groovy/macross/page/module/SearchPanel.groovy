package macross.page.module

import geb.Module

class SearchPanel extends Module {

  static content = {
    searchBox { $('.searchBox') }
    searchButton { $('.searchButton') }
  }
}
