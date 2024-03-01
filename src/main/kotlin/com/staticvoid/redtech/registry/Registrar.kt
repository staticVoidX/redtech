package com.staticvoid.redtech.registry

import com.staticvoid.redtech.MOD_ID
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

abstract class Registrar<T>(private val registry: Registry<T>) {
    fun init() {}

    fun register(id: String, t: T): T = Registry.register(registry, Identifier(MOD_ID, id), t)
}