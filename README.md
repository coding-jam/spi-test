# spi-test
Java SPI Test Project. This project aims to give a try to Java SPI framework.

This Maven project consists in 4 modules:

* **dictionary-lib**: defines SPI abstract class 
* **en-provider**: defines a *Service Provider* for english dictionary
* **it-provider**: defines a *Service Provider* for italian dictionary
* **guess-language**: main module defining API

Last module contains *GuessLanguage*  class: it is a public API providing guess-language service.
