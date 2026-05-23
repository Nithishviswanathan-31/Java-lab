## Exp 10 — JavaFX application

Java GUI application using JavaFX demonstrating controls, layouts, and
event handling. Program shows a button that changes text on click.

| File | Description |
|------|-------------|
| HelloJavaFX.java | JavaFX app — Button in StackPane, click event changes button text |
| JAVA_FX_SCREENSHOT.png | Running output screenshot |

## Concepts used
- JavaFX Application lifecycle: extends Application → start(Stage)
- Stage — primary window, Scene — content container
- StackPane layout — centres child nodes
- Button control with setOnAction() event handler
- Lambda expression: e -> btn.setText("Hello JavaFX!")
- Scene dimensions: 300 × 200 px

## Program flow

```
main() → launch(args)
    → start(Stage primaryStage)
        → Button "Click Me!"
        → setOnAction: changes to "Hello JavaFX!"
        → StackPane → Scene(300,200)
        → primaryStage.show()
```

## Screenshot

![JavaFX Output](JAVA_FX_SCREENSHOT.png)

## Sample output (before and after click)

```
Before click: [ Click Me!      ]
After  click: [ Hello JavaFX!  ]
```

## How to compile & run
```bash
javac --module-path "C:\javafx-sdk-25.0.1\lib" --add-modules javafx.controls,javafx.fxml HelloJavaFX.java

java --module-path "C:\javafx-sdk-25.0.1\lib" --add-modules javafx.controls,javafx.fxml HelloJavaFX
```

## Requirements
- JDK 11+
- JavaFX SDK 25.0.1 (path: C:\javafx-sdk-25.0.1\lib)