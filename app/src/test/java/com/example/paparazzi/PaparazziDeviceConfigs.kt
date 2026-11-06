package com.example.paparazzi

import app.cash.paparazzi.DeviceConfig

fun deviceConfigOf(
    size: PaparazziDeviceSize,
    locale: PaparazziLocaleConfig,
    fontScale: PaparazziFontScale = PaparazziFontScale.DEFAULT,
): DeviceConfig = size.deviceConfig.copy(
    locale = locale.locale,
    layoutDirection = locale.layoutDirection,
    fontScale = fontScale.scale,
)
