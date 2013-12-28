package macross.page

import geb.Page
import macross.page.module.TableModule
import macross.path.PathPresentation
import macross.spec.BaseSpecification

class SearchResultsPage extends Page {

  static url = PathPresentation.SEARCH

  static at = { title.startsWith("${BaseSpecification.PROJECT_NAME} - Search Results") }

  static content = {
    results(required: false) { String name -> module TableModule, $(".$name")}
  }
}

enum ResultTypes {
  SONG('songs'),
  ARTIST('artists'),
  ALBUM('albums')

  String name

  ResultTypes(String name) {
    this.name = name
  }

  @Override
  String toString() {
    this.name
  }
}
