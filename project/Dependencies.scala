import sbt._

object Dependencies {
  object Versions {
    val scala212 = "2.12.14"
    val scala213 = "2.13.6"

    val trace4cats = "0.12.0-RC1+156-7ea07b63"

    val catsEffect = "3.1.1"
    val http4s = "0.23.0-RC1"
  }

  lazy val trace4catsBase = "io.janstenpickle"           %% "trace4cats-base"            % Versions.trace4cats
  lazy val trace4catsCore = "io.janstenpickle"           %% "trace4cats-core"            % Versions.trace4cats
  lazy val trace4catsExporterCommon = "io.janstenpickle" %% "trace4cats-exporter-common" % Versions.trace4cats
  lazy val trace4catsModel = "io.janstenpickle"          %% "trace4cats-model"           % Versions.trace4cats
  lazy val trace4catsInject = "io.janstenpickle"         %% "trace4cats-inject"          % Versions.trace4cats
  lazy val trace4catsTestkit = "io.janstenpickle"        %% "trace4cats-testkit"         % Versions.trace4cats

  lazy val http4sClient = "org.http4s" %% "http4s-client" % Versions.http4s
  lazy val http4sCore = "org.http4s"   %% "http4s-core"   % Versions.http4s
  lazy val http4sDsl = "org.http4s"    %% "http4s-dsl"    % Versions.http4s
}