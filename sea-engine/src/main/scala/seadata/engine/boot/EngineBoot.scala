package seadata.engine.boot

import com.typesafe.config.ConfigFactory
import seadata.inject.SeaServer

object EngineBoot {

  def main(args: Array[String]): Unit = {
    SeaServer.start(ConfigFactory.load())
  }

}
