package com.example.paparazzi

import app.cash.paparazzi.DeviceConfig

enum class PaparazziDeviceSize(val deviceConfig: DeviceConfig) {
    PIXEL_6(DeviceConfig.PIXEL_6),
    PIXEL_9(DeviceConfig.PIXEL_9),
    TABLET(DeviceConfig.PIXEL_TABLET),
}
