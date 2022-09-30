Generate the self certified certificate using the keytool as follows.

keytool -genkeypair -alias DemoSSLSpringApp -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore DemoSSLSpringApp.p12 -validity 3650 -storepass Chaminda -ext "SAN:c=DNS:localhost,IP:127.0.0.1"

List the key
keytool -list -v -storetype pkcs12 -keystore DemoSSLSpringApp.p12
