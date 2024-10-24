import QtQuick
import QtQuick.Controls

Window {
    width: 640
    height: 480
    visible: true
    title: qsTr("Exercise1 - Interfaces")

    RectangleTest {
        id: rectangleTest
        x: 220
        y: 150
        activado: _switch.checked
    }

    Switch {
        id: _switch
        x: 274
        y: 101
        text: qsTr("Switch")
        checked: rectangleTest.activado
    }
}
