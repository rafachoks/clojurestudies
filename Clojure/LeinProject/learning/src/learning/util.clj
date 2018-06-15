(ns learning.util)

(gen-class
    :name learning.MyClass
    :prefix "my-"
    :methods [[getName [] String]]
    :contructors {[String] []}
    :state state
    :init init)
