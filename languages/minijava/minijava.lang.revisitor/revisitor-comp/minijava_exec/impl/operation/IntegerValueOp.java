package minijava_exec.impl.operation;

import java.lang.String;
import miniJava.Value;

public interface IntegerValueOp extends ValueOp {
	String customToString();

	Value copyj();
}
