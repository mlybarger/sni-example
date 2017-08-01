FROM jboss/switchyard-wildfly  
ADD target/sni-example-0.0.1-SNAPSHOT.jar /opt/jboss/wildfly/standalone/deployments/
ADD input /tmp/input