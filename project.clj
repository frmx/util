(defproject mx.roads.forgotten/util "0.1.0-SNAPSHOT"
  :description "FRMX utility library"
  :url "https://github.com/frmx/util"
  :scm {
    :name "git"
    :url  "https://github.com/frmx/util"}
  :license {
    :name "Apache License, Version 2.0"
    :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [
    [org.clojure/clojure "1.8.0"]
    [clojusc/env-ini "0.2.0-SNAPSHOT"]
    [clojusc/twig "0.3.0"]
    [potemkin "0.4.3"]]
  :profiles {
    :uber {
      :aot :all}
    :test {
      :plugins [
        [jonase/eastwood "0.2.3" :exclusions [org.clojure/clojure]]
        [lein-kibit "0.1.2" :exclusions [org.clojure/clojure]]]
      :source-paths ["test"]
        :test-selectors {
        :default :unit
        :unit :unit
        :system :system
        :integration :integration}}
    :doc {
      :plugins [
        [lein-codox "0.10.1"]]
      :codox {
        :project {:name "FRMX Utility Library"}
        :output-path "docs/master/current"
        :doc-paths ["docs/source"]
        :namespaces [#"^mx.roads.forgotten\."]
        :metadata {
          :doc/format :markdown
          :doc "Documentation forthcoming"}}}
    :dev {
      :dependencies [
        [org.clojure/tools.namespace "0.2.11" :exclusions [org.clojure/clojure]]
        [lein-simpleton "1.3.0" :exclusions [org.clojure/clojure]]]
      :source-paths ["dev-resources/src"]
      :repl-options {:init-ns mx.roads.forgotten.util}}})
