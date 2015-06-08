resolvers ++= Seq(
  Resolver.url("bintray-sbt-plugin-releases",
    url("http://dl.bintray.com/content/sbt/sbt-plugin-releases")
  )(Resolver.ivyStylePatterns),
  Resolver.url(
  "tpolecat-sbt-plugin-releases",
    url("http://dl.bintray.com/content/tpolecat/sbt-plugin-releases")
  )(Resolver.ivyStylePatterns)
)

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.0")

addSbtPlugin("me.lessis"         % "bintray-sbt"            % "0.2.1")
addSbtPlugin("com.github.gseitz" % "sbt-release"            % "0.7.1")
addSbtPlugin("com.typesafe.sbt"  % "sbt-site"               % "0.8.1")
addSbtPlugin("com.typesafe.sbt"  % "sbt-ghpages"            % "0.5.3")
addSbtPlugin("org.tpolecat"      % "tut-plugin"             % "0.3.2")
addSbtPlugin("net.virtual-void"  % "sbt-dependency-graph"   % "0.7.5")