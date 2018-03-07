// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: api/track.proto at 224:1
package tv.abema.protos;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import java.lang.Override;

public enum MineMethodType implements WireEnum {
  method_other(0),

  method_initial(1),

  method_linear_rewind(2),

  method_timeshift_fast_forward(3),

  method_timeshift_rewind(4),

  method_player_change(5);

  public static final ProtoAdapter<MineMethodType> ADAPTER = ProtoAdapter.newEnumAdapter(MineMethodType.class);

  private final int value;

  MineMethodType(int value) {
    this.value = value;
  }

  /**
   * Return the constant for {@code value} or null.
   */
  public static MineMethodType fromValue(int value) {
    switch (value) {
      case 0: return method_other;
      case 1: return method_initial;
      case 2: return method_linear_rewind;
      case 3: return method_timeshift_fast_forward;
      case 4: return method_timeshift_rewind;
      case 5: return method_player_change;
      default: return null;
    }
  }

  @Override
  public int getValue() {
    return value;
  }
}