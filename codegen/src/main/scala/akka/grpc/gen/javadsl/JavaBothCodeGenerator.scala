/*
 * Copyright (C) 2018 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.grpc.gen.javadsl

object JavaBothCodeGenerator extends JavaServerCodeGenerator with JavaClientCodeGenerator {
  override def name = "akka-grpc-javadsl-both"
}
