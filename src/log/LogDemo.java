package log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogDemo {
  private static final Logger LOGGER = LogManager.getLogger(LogDemo.class);

  public static void main(String[] args) {
    LOGGER.debug("debug");
    LOGGER.info("info");
    LOGGER.warn("warn");
    LOGGER.error("error");
  }
}
