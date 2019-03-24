package lib.screenframe

import lib.screenframe.models.Device
import lib.screenframe.models.Orientation
import lib.screenframe.utils.Util.getBitmap
import java.io.File

class FrameGenerator {
    private val device: Device

    constructor(device: Device) {
        this.device = device
    }

    public fun generateFrame(screenshot: File): File? {

        val image = getBitmap(screenshot)

        val orientation = Orientation.calculate(image,device)

        return File("")
    }
}

