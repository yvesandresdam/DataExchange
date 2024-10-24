import QtQuick


    Rectangle {
        id: rectangle
        width: 200
        height: 200
        color: "#4237bd"
        border.color: "#ff6000"
        border.width: 10
        states: [
            State {
                name: "activado"
                when: rectangle.activado

                PropertyChanges {
                    target: rectangle
                    color: "#ff4c4c"
                }
            }
        ]
        transitions: [
            Transition {
                id: transition
                ParallelAnimation {
                    SequentialAnimation {
                        PauseAnimation {
                            duration: 0
                        }

                        PropertyAnimation {
                            target: rectangle
                            property: "color"
                            duration: 2000
                        }
                    }
                }
                to: "*"
                from: "*"
            }
        ]
        property bool activado: false

    }



/*##^##
Designer {
    D{i:0}D{i:3;transitionDuration:2000}
}
##^##*/
