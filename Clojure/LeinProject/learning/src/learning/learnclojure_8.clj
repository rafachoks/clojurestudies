(ns learnclojure.core)

(defmulti games :company)

(defmethod games ::bethesta [_] "The Elders Scrolls")
(defmethod games ::ubisoft [_] "Assassins Creed")
(defmethod games ::konami [_] "Castlevania")
(defmethod games ::capcom [_] "Onimusha")


(games {:company ::konami})
(games {:company ::ubisoft})
(games {:company ::capcom})


(derive ::darksouls ::capcom)

(games {:company ::darksouls})

(isa? ::darksouls ::konami)