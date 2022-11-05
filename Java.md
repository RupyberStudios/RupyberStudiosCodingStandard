# Java

## Code Style

- 4 spaces indentation must be used
- Code style [examples](./CodeStyle.java)

## Packages

- Main package must be named `net.rupyber_studios.<mod_id>`
- Must be named using `lower_case_and_underscore`
- A package must be named using a singular word, e.g. `util` and not `utils`

## Classes

- Must be named using `PascalCase`
- A class should be `abstract` if it should not be instantiated
- Classes that, for example, extend a Minecraft class like `FernBlock` to make its constructor public should be named `ModFernBlock`

## Fields

- Must be named using `camelCase`
- Final fields must be named using `UPPER_CASE_AND_UNDERSCORES`
- Fields must be named with a meaningful name or with the `camelCase` of the `Type`
- Fields should usually be `private` or `protected`

## Methods

- Must be named using `camelCase`
- Should contain comments if the code is not self-explanatory
- Use of the `@Override` annotation is mandatory
- Getters and setters of a `<field>` must be named `set<field>(<type> <field>)` and `get<field>()`
- Parameters that are used to set fields should have the same name and the `this` keyword should be used
- Parameters and variables must be named with a meaningful name, with the `camelCase` of the `Type`, or in loops with the letters `i`, `j`, `k`, `x`, `y` and `z`