package macross

presentation {
  baseUrl = "http://localhost:5000"
  baseContext = ""
}
stubulator {
  baseUrl = "http://localhost:5001"
  baseContext = ""
}

environments {
  func01 {
    presentation {
      baseUrl = "http://macross-presentation-func01.herokuapp.com/"
      baseContext = ""
    }
    stubulator  {
      baseUrl = "http://macross-presentation-stub01.herokuapp.com/"
      baseContext = ""
    }
  }
}
