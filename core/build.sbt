/*
 * Copyright 2017 Daniel Spiewak
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

libraryDependencies += "com.codecommit" %% "shims-core" % Versions.Shims

libraryDependencies ++= Seq(
  "com.codecommit" %% "shims-cats"        % Versions.Shims  % Test,

  "org.scalacheck" %% "scalacheck"        % "1.13.4"        % Test,
  "org.specs2"     %% "specs2-core"       % Versions.Specs  % Test,
  "org.specs2"     %% "specs2-scalacheck" % Versions.Specs  % Test)

initialCommands := "import parseback._"

scalacOptions in Test += "-Yrangepos"

scalacOptions in (Compile, console) ~= (_ filterNot (Set("-Xfatal-warnings", "-Ywarn-unused-import").contains))

scalacOptions in (Test, console) := (scalacOptions in (Compile, console)).value
