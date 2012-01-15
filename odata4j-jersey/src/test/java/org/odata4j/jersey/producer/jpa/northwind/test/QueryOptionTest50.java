package org.odata4j.jersey.producer.jpa.northwind.test;

import org.odata4j.jersey.examples.producer.JerseyProducerUtil;
import org.odata4j.producer.jpa.northwind.test.AbstractQueryOptionTest50;
import org.odata4j.producer.jpa.northwind.test.NorthwindTestUtils;
import org.odata4j.producer.server.ODataServer;

public class QueryOptionTest50 extends AbstractQueryOptionTest50 {
  @Override
  public void hostODataServer(String baseUri) {
    JerseyProducerUtil.hostODataServer(baseUri);
  }

  @Override
  public ODataServer startODataServer(String baseUri) {
    return JerseyProducerUtil.startODataServer(baseUri);
  }

  @Override
  public NorthwindTestUtils getUtils() {
    return new JerseyNorthwindTestUtils();
  }
}