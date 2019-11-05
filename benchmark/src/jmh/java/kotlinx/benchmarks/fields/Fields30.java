package kotlinx.benchmarks.fields;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.CompositeDecoder;
import kotlinx.serialization.Decoder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialDescriptor;

public class Fields30 {
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
    int i20;
    int i21;
    int i22;
    int i23;
    int i24;
    int i25;
    int i26;
    int i27;
    int i28;
    int i29;
    int i30;

    public Fields30(int mask, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30) {
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
        this.i20 = i20;
        this.i21 = i21;
        this.i22 = i22;
        this.i23 = i23;
        this.i24 = i24;
        this.i25 = i25;
        this.i26 = i26;
        this.i27 = i27;
        this.i28 = i28;
        this.i29 = i29;
        this.i30 = i30;
    }

    public static Fields30 deserialize(Decoder decoder) {
        Intrinsics.checkParameterIsNotNull(decoder, "decoder");
        SerialDescriptor var2 = null;
        boolean readAll = false;
        int mask = 0;
        CompositeDecoder composite = decoder.beginStructure(var2, new KSerializer[0]);
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
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        while (true) {
            int idx = composite.decodeElementIndex(var2);
            switch (idx) {
                case -2:
                    readAll = true;

                case 0:
                    i1 = composite.decodeIntElement(var2, 0);
                    mask |= 2;
                    if (!readAll) {
                        break;
                    }
                case 1:
                    i2 = composite.decodeIntElement(var2, 1);
                    mask |= 4;
                    if (!readAll) {
                        break;
                    }
                case 2:
                    i3 = composite.decodeIntElement(var2, 2);
                    mask |= 8;
                    if (!readAll) {
                        break;
                    }
                case 3:
                    i4 = composite.decodeIntElement(var2, 3);
                    mask |= 16;
                    if (!readAll) {
                        break;
                    }
                case 4:
                    i5 = composite.decodeIntElement(var2, 4);
                    mask |= 32;
                    if (!readAll) {
                        break;
                    }
                case 5:
                    i6 = composite.decodeIntElement(var2, 5);
                    mask |= 64;
                    if (!readAll) {
                        break;
                    }
                case 6:
                    i7 = composite.decodeIntElement(var2, 6);
                    mask |= 128;
                    if (!readAll) {
                        break;
                    }
                case 7:
                    i8 = composite.decodeIntElement(var2, 7);
                    mask |= 256;
                    if (!readAll) {
                        break;
                    }
                case 8:
                    i9 = composite.decodeIntElement(var2, 8);
                    mask |= 512;
                    if (!readAll) {
                        break;
                    }
                case 9:
                    i10 = composite.decodeIntElement(var2, 9);
                    mask |= 1024;
                    if (!readAll) {
                        break;
                    }
                case 10:
                    i11 = composite.decodeIntElement(var2, 10);
                    mask |= 2048;
                    if (!readAll) {
                        break;
                    }
                case 11:
                    i12 = composite.decodeIntElement(var2, 11);
                    mask |= 4096;
                    if (!readAll) {
                        break;
                    }
                case 12:
                    i13 = composite.decodeIntElement(var2, 12);
                    mask |= 8192;
                    if (!readAll) {
                        break;
                    }
                case 13:
                    i14 = composite.decodeIntElement(var2, 13);
                    mask |= 16384;
                    if (!readAll) {
                        break;
                    }
                case 14:
                    i15 = composite.decodeIntElement(var2, 14);
                    mask |= 32768;
                    if (!readAll) {
                        break;
                    }
                case 15:
                    i16 = composite.decodeIntElement(var2, 15);
                    mask |= 65536;
                    if (!readAll) {
                        break;
                    }
                case 16:
                    i17 = composite.decodeIntElement(var2, 16);
                    mask |= 131072;
                    if (!readAll) {
                        break;
                    }
                case 17:
                    i18 = composite.decodeIntElement(var2, 17);
                    mask |= 262144;
                    if (!readAll) {
                        break;
                    }
                case 18:
                    i19 = composite.decodeIntElement(var2, 18);
                    mask |= 524288;
                    if (!readAll) {
                        break;
                    }
                case 19:
                    i20 = composite.decodeIntElement(var2, 19);
                    mask |= 1048576;
                    if (!readAll) {
                        break;
                    }
                case 20:
                    i21 = composite.decodeIntElement(var2, 20);
                    mask |= 2097152;
                    if (!readAll) {
                        break;
                    }
                case 21:
                    i22 = composite.decodeIntElement(var2, 21);
                    mask |= 4194304;
                    if (!readAll) {
                        break;
                    }
                case 22:
                    i23 = composite.decodeIntElement(var2, 22);
                    mask |= 8388608;
                    if (!readAll) {
                        break;
                    }
                case 23:
                    i24 = composite.decodeIntElement(var2, 23);
                    mask |= 16777216;
                    if (!readAll) {
                        break;
                    }
                case 24:
                    i25 = composite.decodeIntElement(var2, 24);
                    mask |= 33554432;
                    if (!readAll) {
                        break;
                    }
                case 25:
                    i26 = composite.decodeIntElement(var2, 25);
                    mask |= 67108864;
                    if (!readAll) {
                        break;
                    }
                case 26:
                    i27 = composite.decodeIntElement(var2, 26);
                    mask |= 134217728;
                    if (!readAll) {
                        break;
                    }
                case 27:
                    i28 = composite.decodeIntElement(var2, 27);
                    mask |= 268435456;
                    if (!readAll) {
                        break;
                    }
                case 28:
                    i29 = composite.decodeIntElement(var2, 28);
                    mask |= 536870912;
                    if (!readAll) {
                        break;
                    }
                case 29:
                    i30 = composite.decodeIntElement(var2, 29);
                    mask |= 1073741824;
                    if (!readAll) {
                        break;
                    }
                case -1:
                    composite.endStructure(var2);
                    return new Fields30(mask, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30);
                default:
                    throw new RuntimeException();
            }
        }
    }
}

