# Suneasy (Backend)

## Stack
- Java JDK: 17
- Spring Boot: 3.1.4
- Dependencies: Gradle 
- Springdoc OpenAPI: 2.1.0

## Class Diagrams

### Panel Service Classes

``` mermaid
classDiagram
  class SolarPanel {
    - id: Long
    - manufacturer: String
    - models: List~SolarPanelModel~ 
  }
  class SolarPanelModel {
    - id: Long
    - name: String
    - type: String
    - efficiency: double
    - maximumPower: double
    - voltage: double
    - current: double
    - length: double
    - width: double
    - thickness: double
    - weight: double
    - frameColor: String
    - warrantyYears: int
    - manufacturer: String
  }

  SolarPanel --> SolarPanelModel
  
```

### Inverter Service Classes

``` mermaid
classDiagram
  class Inverter {
    - id: Long
    - manufacturer: String
    - models: List~InverterModel~
  }
  class InverterModel {
    + id: Long
    + name: String
    + type: String
    + capacity: double
    + efficiency: double
    + inputVoltageMin: double
    + inputVoltageMax: double
    + outputVoltage: double
    + numberMPPTs: int
    + maxInputCurrent: double
    + maxOutputCurrent: double
    + maxInputShortCircuitCurrent: double
    + gridConnection: String
    + gridVoltage: double
    + weight: double
    + warrantyYears: int
    + manufacturer: String
  }
  Inverter --> InverterModel


```
