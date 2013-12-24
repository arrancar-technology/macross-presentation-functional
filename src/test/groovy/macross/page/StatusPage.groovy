package macross.page

import macross.page.module.TableModule
import macross.path.PathPresentation

class StatusPage extends BasePage {
  static url = PathPresentation.STATUS

  static at = {
    title == "macross presentation admin"
    header.text() == "macross presentation status"
  }

  static content = {
    header { $("h2") }

    status(required: false) { name -> module TableModule, $(".$name")}
  }
}
