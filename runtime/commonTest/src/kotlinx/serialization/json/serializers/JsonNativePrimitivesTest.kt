/*
 * Copyright 2017-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.serialization.json.serializers

import kotlinx.serialization.SampleEnum
import kotlinx.serialization.internal.*
import kotlinx.serialization.json.JsonTestBase
import kotlinx.serialization.test.CommonEnumSerializer
import kotlin.test.Test

class JsonNativePrimitivesTest : JsonTestBase() {
    @Test
    fun testTopLevelNativeInt() = assertJsonFormAndRestored(IntSerializer, 42, "42", strict)

    @Test
    fun testTopLevelNativeString() = assertJsonFormAndRestored(StringSerializer, "42", "\"42\"", strict)

    @Test
    fun testTopLevelNativeChar() = assertJsonFormAndRestored(CharSerializer, '4', "\"4\"", strict)

    @Test
    fun testTopLevelNativeBoolean() = assertJsonFormAndRestored(BooleanSerializer, true, "true", strict)

    @Test
    fun testTopLevelNativeEnum() =
        assertJsonFormAndRestored(CommonEnumSerializer("SampleEnum"), SampleEnum.OptionB, "\"OptionB\"", strict)

    @Test
    fun testTopLevelNativeNullable() =
        assertJsonFormAndRestored(NullableSerializer(IntSerializer), null, "null", strict)
}
