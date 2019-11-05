package kotlinx.benchmarks.fields;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.CompositeDecoder;
import kotlinx.serialization.Decoder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialDescriptor;

public class Fields19New2 {
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    int i11;
    int i12;
    int i13;
    int i14;
    int i15;
    int i16;
    int i17;
    int i18;
    int i19;

    public Fields19New2(int mask, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
        this.i5 = i5;
        this.i6 = i6;
        this.i7 = i7;
        this.i8 = i8;
        this.i9 = i9;
        this.i10 = i10;
        this.i11 = i11;
        this.i12 = i12;
        this.i13 = i13;
        this.i14 = i14;
        this.i15 = i15;
        this.i16 = i16;
        this.i17 = i17;
        this.i18 = i18;
        this.i19 = i19;
    }

    public static Fields19New2 deserialize(Decoder decoder) {
        Intrinsics.checkParameterIsNotNull(decoder, "decoder");
        SerialDescriptor var2 = null;
        CompositeDecoder composite = decoder.beginStructure(var2, new KSerializer[0]);
        if (composite.readAll()) {
            return readAll(var2, composite);
        } else {
            return byOne(var2, composite);
        }
    }

    private static Fields19New2 byOne(SerialDescriptor var2, CompositeDecoder composite) {
        int i1 = composite.decodeIntElement(var2, 1);
        int i2 = composite.decodeIntElement(var2, 2);
        int i3 = composite.decodeIntElement(var2, 3);
        int i4 = composite.decodeIntElement(var2, 4);
        int i5 = composite.decodeIntElement(var2, 5);
        int i6 = composite.decodeIntElement(var2, 6);
        int i7 = composite.decodeIntElement(var2, 7);
        int i8 = composite.decodeIntElement(var2, 8);
        int i9 = composite.decodeIntElement(var2, 9);
        int i10 = composite.decodeIntElement(var2, 10);
        int i11 = composite.decodeIntElement(var2, 11);
        int i12 = composite.decodeIntElement(var2, 12);
        int i13 = composite.decodeIntElement(var2, 13);
        int i14 = composite.decodeIntElement(var2, 14);
        int i15 = composite.decodeIntElement(var2, 15);
        int i16 = composite.decodeIntElement(var2, 16);
        int i17 = composite.decodeIntElement(var2, 17);
        int i18 = composite.decodeIntElement(var2, 18);
        int i19 = composite.decodeIntElement(var2, 19);
        composite.endStructure(var2);
        return new Fields19New2(Integer.MAX_VALUE, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19);
    }

    private static Fields19New2 readAll(SerialDescriptor var2, CompositeDecoder composite) {

        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int mask = 0;
        while (true) {
            int idx = composite.decodeElementIndex(var2);
            switch (idx) {
                case 0:
                    i1 = composite.decodeIntElement(var2, 0);
                    mask |= 2;
                    break;
                case 1:
                    i2 = composite.decodeIntElement(var2, 1);
                    mask |= 4;
                    break;
                case 2:
                    i3 = composite.decodeIntElement(var2, 2);
                    mask |= 8;
                    break;
                case 3:
                    i4 = composite.decodeIntElement(var2, 3);
                    mask |= 16;
                    break;
                case 4:
                    i5 = composite.decodeIntElement(var2, 4);
                    mask |= 32;
                    break;
                case 5:
                    i6 = composite.decodeIntElement(var2, 5);
                    mask |= 64;
                    break;
                case 6:
                    i7 = composite.decodeIntElement(var2, 6);
                    mask |= 128;
                    break;
                case 7:
                    i8 = composite.decodeIntElement(var2, 7);
                    mask |= 256;
                    break;
                case 8:
                    i9 = composite.decodeIntElement(var2, 8);
                    mask |= 512;
                    break;
                case 9:
                    i10 = composite.decodeIntElement(var2, 9);
                    mask |= 1024;
                    break;
                case 10:
                    i11 = composite.decodeIntElement(var2, 10);
                    mask |= 2048;
                    break;
                case 11:
                    i12 = composite.decodeIntElement(var2, 11);
                    mask |= 4096;
                    break;
                case 12:
                    i13 = composite.decodeIntElement(var2, 12);
                    mask |= 8192;
                    break;
                case 13:
                    i14 = composite.decodeIntElement(var2, 13);
                    mask |= 16384;
                    break;
                case 14:
                    i15 = composite.decodeIntElement(var2, 14);
                    mask |= 32768;
                    break;
                case 15:
                    i16 = composite.decodeIntElement(var2, 15);
                    mask |= 65536;
                    break;
                case 16:
                    i17 = composite.decodeIntElement(var2, 16);
                    mask |= 131072;
                    break;
                case 17:
                    i18 = composite.decodeIntElement(var2, 17);
                    mask |= 262144;
                    break;
                case 18:
                    i19 = composite.decodeIntElement(var2, 18);
                    mask |= 524288;
                    break;
                case -1:
                    composite.endStructure(var2);
                    return new Fields19New2(mask, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19);
                default:
                    throw new RuntimeException();
            }
        }
    }
}

