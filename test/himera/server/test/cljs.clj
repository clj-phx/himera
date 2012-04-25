; Copyright (c) 2012 Fogus and Relevance Inc. All rights reserved.  The
; use and distribution terms for this software are covered by the Eclipse
; Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
; which can be found in the file COPYING the root of this
; distribution.  By using this software in any fashion, you are
; agreeing to be bound by the terms of this license.  You must not
; remove this notice, or any other, from this software.

(ns himera.server.test.cljs
  (:use [himera.server.cljs])
  (:use [clojure.test]))

(deftest test-compilation
  (are [expr opt pp expected] (= expected (compilation expr opt pp))
       '(range 1 10) :simple true {:result "cljs.core.range.call(null,1,10)", :status 200}
       '(asdf 1 10) :simple true {:result "cljs.user.asdf.call(null,1,10)", :status 200}))

