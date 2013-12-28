package macross.path

import macross.spec.BaseSpecification

enum PathPresentation {
  BASE(BaseSpecification.config.presentation.baseContext),

  // Page paths
  STATUS("$BASE/admin/status"),
  SEARCH("$BASE/search"),

  // API paths
  API_1_STATUS("$BASE/api/1/status")

  String path

  PathPresentation(String path) {
    this.path = path
  }

  @Override
  String toString() {
    this.path
  }
}
