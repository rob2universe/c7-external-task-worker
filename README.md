## Camunda 7 External Task Worker Example

To run use:
```mvn clean package```

```docker compose up```

The docker compose file starts a Camunda engine and multiple instances of the worker image.

Once engine an worker sare running, deploy the **process model** e.g. from the desktop modeler.

Then start an process e.g. via included **postman collection**.

Follow the worker console output or check Camunda Cockpit job logs.
