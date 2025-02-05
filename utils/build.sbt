
scalaVersion := "2.12.3"

resolvers += Resolver.jcenterRepo
resolvers += Resolver.bintrayRepo("neelsmith","maven")
resolvers += "beta" at "http://beta.hpcc.uh.edu/nexus/content/repositories/releases"

libraryDependencies ++=   Seq(
  "edu.holycross.shot.cite" %% "xcite" % "2.7.1",
  "edu.holycross.shot" %% "ohco2" % "10.1.2",
  "edu.holycross.shot" %% "scm" % "5.1.3"
)
