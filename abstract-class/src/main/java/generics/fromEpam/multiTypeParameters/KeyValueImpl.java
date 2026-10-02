package generics.fromEpam.multiTypeParameters;

public class KeyValueImpl<Key, Value> implements KeyValue<Key, Value> {
	private Key key;
	private Value value;

	public Key getKey() {
		return key;
	}
	public Value getValue() {
		return value;
	}
	public void setKey(Key key) {
		this.key = key;
	}
	public void setValue(Value value) {
		this.value = value;
	}
	@Override
	public Key KeyDemo() {
		return getKey();
	}
	@Override
	public Value ValueDemo() {
		return getValue();
	}
	
}
