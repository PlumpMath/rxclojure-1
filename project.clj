(defproject rxclojure-nico "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :java-source-paths ["src-java"] 
  :dependencies [
  [org.clojure/clojure "1.8.0"]
  [io.reactivex/rxjava "1.2.5"]
  ]
  :profiles {:dev {:resource-paths ["dummy-data"]
	:dependencies [[clj-http "3.4.1"]]}}

 )