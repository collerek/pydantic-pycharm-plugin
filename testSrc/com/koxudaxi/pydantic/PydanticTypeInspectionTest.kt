package com.koxudaxi.pydantic

import com.jetbrains.python.inspections.PyInspection
import com.jetbrains.python.inspections.PyTypeCheckerInspection
import kotlin.reflect.KClass


open class PydanticTypeInspectionTest : PydanticInspectionBase() {

    @Suppress("UNCHECKED_CAST")
    override val inspectionClass: KClass<PyInspection> = PyTypeCheckerInspection::class as KClass<PyInspection>

    fun testField() {
        doTest()
    }

    fun testFieldDefaultValue() {
        doTest()
    }

    fun testFieldUnion() {
        doTest()
    }

    fun testFieldOptional() {
        doTest()
    }

    fun testFieldOptionalDefaultValue() {
        doTest()
    }

    fun testFieldInvalid() {
        doTest()
    }

    fun testFieldDefaultValueInvalid() {
        doTest()
    }

    fun testFieldUnionInvalid() {
        doTest()
    }

    fun testFieldOptionalInvalid() {
        doTest()
    }

    fun testFieldOptionalDefaultValueInvalid() {
        doTest()
    }

    fun testFieldEllipsis() {
        doTest()
    }

    fun testFieldSchema() {
        doTest()
    }

    fun testFieldSchemaInvalid() {
        doTest()
    }

    fun testFieldBroken() {
        doTest()
    }

    fun testBaseSetting (){
        doTest()
    }
}
