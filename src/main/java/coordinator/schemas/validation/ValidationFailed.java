/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package coordinator.schemas.validation;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ValidationFailed extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6029283951551769195L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ValidationFailed\",\"namespace\":\"coordinator.schemas.validation\",\"fields\":[{\"name\":\"transactionId\",\"type\":\"string\"},{\"name\":\"correlationId\",\"type\":\"string\"},{\"name\":\"accountFromId\",\"type\":\"string\"},{\"name\":\"accountToId\",\"type\":\"string\"},{\"name\":\"amount\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ValidationFailed> ENCODER =
      new BinaryMessageEncoder<ValidationFailed>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ValidationFailed> DECODER =
      new BinaryMessageDecoder<ValidationFailed>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<ValidationFailed> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<ValidationFailed> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ValidationFailed>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this ValidationFailed to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a ValidationFailed from a ByteBuffer. */
  public static ValidationFailed fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence transactionId;
  @Deprecated public java.lang.CharSequence correlationId;
  @Deprecated public java.lang.CharSequence accountFromId;
  @Deprecated public java.lang.CharSequence accountToId;
  @Deprecated public java.lang.CharSequence amount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ValidationFailed() {}

  /**
   * All-args constructor.
   * @param transactionId The new value for transactionId
   * @param correlationId The new value for correlationId
   * @param accountFromId The new value for accountFromId
   * @param accountToId The new value for accountToId
   * @param amount The new value for amount
   */
  public ValidationFailed(java.lang.CharSequence transactionId, java.lang.CharSequence correlationId, java.lang.CharSequence accountFromId, java.lang.CharSequence accountToId, java.lang.CharSequence amount) {
    this.transactionId = transactionId;
    this.correlationId = correlationId;
    this.accountFromId = accountFromId;
    this.accountToId = accountToId;
    this.amount = amount;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return transactionId;
    case 1: return correlationId;
    case 2: return accountFromId;
    case 3: return accountToId;
    case 4: return amount;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: transactionId = (java.lang.CharSequence)value$; break;
    case 1: correlationId = (java.lang.CharSequence)value$; break;
    case 2: accountFromId = (java.lang.CharSequence)value$; break;
    case 3: accountToId = (java.lang.CharSequence)value$; break;
    case 4: amount = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'transactionId' field.
   * @return The value of the 'transactionId' field.
   */
  public java.lang.CharSequence getTransactionId() {
    return transactionId;
  }

  /**
   * Sets the value of the 'transactionId' field.
   * @param value the value to set.
   */
  public void setTransactionId(java.lang.CharSequence value) {
    this.transactionId = value;
  }

  /**
   * Gets the value of the 'correlationId' field.
   * @return The value of the 'correlationId' field.
   */
  public java.lang.CharSequence getCorrelationId() {
    return correlationId;
  }

  /**
   * Sets the value of the 'correlationId' field.
   * @param value the value to set.
   */
  public void setCorrelationId(java.lang.CharSequence value) {
    this.correlationId = value;
  }

  /**
   * Gets the value of the 'accountFromId' field.
   * @return The value of the 'accountFromId' field.
   */
  public java.lang.CharSequence getAccountFromId() {
    return accountFromId;
  }

  /**
   * Sets the value of the 'accountFromId' field.
   * @param value the value to set.
   */
  public void setAccountFromId(java.lang.CharSequence value) {
    this.accountFromId = value;
  }

  /**
   * Gets the value of the 'accountToId' field.
   * @return The value of the 'accountToId' field.
   */
  public java.lang.CharSequence getAccountToId() {
    return accountToId;
  }

  /**
   * Sets the value of the 'accountToId' field.
   * @param value the value to set.
   */
  public void setAccountToId(java.lang.CharSequence value) {
    this.accountToId = value;
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public java.lang.CharSequence getAmount() {
    return amount;
  }

  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(java.lang.CharSequence value) {
    this.amount = value;
  }

  /**
   * Creates a new ValidationFailed RecordBuilder.
   * @return A new ValidationFailed RecordBuilder
   */
  public static coordinator.schemas.validation.ValidationFailed.Builder newBuilder() {
    return new coordinator.schemas.validation.ValidationFailed.Builder();
  }

  /**
   * Creates a new ValidationFailed RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ValidationFailed RecordBuilder
   */
  public static coordinator.schemas.validation.ValidationFailed.Builder newBuilder(coordinator.schemas.validation.ValidationFailed.Builder other) {
    return new coordinator.schemas.validation.ValidationFailed.Builder(other);
  }

  /**
   * Creates a new ValidationFailed RecordBuilder by copying an existing ValidationFailed instance.
   * @param other The existing instance to copy.
   * @return A new ValidationFailed RecordBuilder
   */
  public static coordinator.schemas.validation.ValidationFailed.Builder newBuilder(coordinator.schemas.validation.ValidationFailed other) {
    return new coordinator.schemas.validation.ValidationFailed.Builder(other);
  }

  /**
   * RecordBuilder for ValidationFailed instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ValidationFailed>
    implements org.apache.avro.data.RecordBuilder<ValidationFailed> {

    private java.lang.CharSequence transactionId;
    private java.lang.CharSequence correlationId;
    private java.lang.CharSequence accountFromId;
    private java.lang.CharSequence accountToId;
    private java.lang.CharSequence amount;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(coordinator.schemas.validation.ValidationFailed.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.transactionId)) {
        this.transactionId = data().deepCopy(fields()[0].schema(), other.transactionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.correlationId)) {
        this.correlationId = data().deepCopy(fields()[1].schema(), other.correlationId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.accountFromId)) {
        this.accountFromId = data().deepCopy(fields()[2].schema(), other.accountFromId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.accountToId)) {
        this.accountToId = data().deepCopy(fields()[3].schema(), other.accountToId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.amount)) {
        this.amount = data().deepCopy(fields()[4].schema(), other.amount);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ValidationFailed instance
     * @param other The existing instance to copy.
     */
    private Builder(coordinator.schemas.validation.ValidationFailed other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.transactionId)) {
        this.transactionId = data().deepCopy(fields()[0].schema(), other.transactionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.correlationId)) {
        this.correlationId = data().deepCopy(fields()[1].schema(), other.correlationId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.accountFromId)) {
        this.accountFromId = data().deepCopy(fields()[2].schema(), other.accountFromId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.accountToId)) {
        this.accountToId = data().deepCopy(fields()[3].schema(), other.accountToId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.amount)) {
        this.amount = data().deepCopy(fields()[4].schema(), other.amount);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'transactionId' field.
      * @return The value.
      */
    public java.lang.CharSequence getTransactionId() {
      return transactionId;
    }

    /**
      * Sets the value of the 'transactionId' field.
      * @param value The value of 'transactionId'.
      * @return This builder.
      */
    public coordinator.schemas.validation.ValidationFailed.Builder setTransactionId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.transactionId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'transactionId' field has been set.
      * @return True if the 'transactionId' field has been set, false otherwise.
      */
    public boolean hasTransactionId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'transactionId' field.
      * @return This builder.
      */
    public coordinator.schemas.validation.ValidationFailed.Builder clearTransactionId() {
      transactionId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'correlationId' field.
      * @return The value.
      */
    public java.lang.CharSequence getCorrelationId() {
      return correlationId;
    }

    /**
      * Sets the value of the 'correlationId' field.
      * @param value The value of 'correlationId'.
      * @return This builder.
      */
    public coordinator.schemas.validation.ValidationFailed.Builder setCorrelationId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.correlationId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'correlationId' field has been set.
      * @return True if the 'correlationId' field has been set, false otherwise.
      */
    public boolean hasCorrelationId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'correlationId' field.
      * @return This builder.
      */
    public coordinator.schemas.validation.ValidationFailed.Builder clearCorrelationId() {
      correlationId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'accountFromId' field.
      * @return The value.
      */
    public java.lang.CharSequence getAccountFromId() {
      return accountFromId;
    }

    /**
      * Sets the value of the 'accountFromId' field.
      * @param value The value of 'accountFromId'.
      * @return This builder.
      */
    public coordinator.schemas.validation.ValidationFailed.Builder setAccountFromId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.accountFromId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'accountFromId' field has been set.
      * @return True if the 'accountFromId' field has been set, false otherwise.
      */
    public boolean hasAccountFromId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'accountFromId' field.
      * @return This builder.
      */
    public coordinator.schemas.validation.ValidationFailed.Builder clearAccountFromId() {
      accountFromId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'accountToId' field.
      * @return The value.
      */
    public java.lang.CharSequence getAccountToId() {
      return accountToId;
    }

    /**
      * Sets the value of the 'accountToId' field.
      * @param value The value of 'accountToId'.
      * @return This builder.
      */
    public coordinator.schemas.validation.ValidationFailed.Builder setAccountToId(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.accountToId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'accountToId' field has been set.
      * @return True if the 'accountToId' field has been set, false otherwise.
      */
    public boolean hasAccountToId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'accountToId' field.
      * @return This builder.
      */
    public coordinator.schemas.validation.ValidationFailed.Builder clearAccountToId() {
      accountToId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public java.lang.CharSequence getAmount() {
      return amount;
    }

    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public coordinator.schemas.validation.ValidationFailed.Builder setAmount(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.amount = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public coordinator.schemas.validation.ValidationFailed.Builder clearAmount() {
      amount = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ValidationFailed build() {
      try {
        ValidationFailed record = new ValidationFailed();
        record.transactionId = fieldSetFlags()[0] ? this.transactionId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.correlationId = fieldSetFlags()[1] ? this.correlationId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.accountFromId = fieldSetFlags()[2] ? this.accountFromId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.accountToId = fieldSetFlags()[3] ? this.accountToId : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.amount = fieldSetFlags()[4] ? this.amount : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ValidationFailed>
    WRITER$ = (org.apache.avro.io.DatumWriter<ValidationFailed>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ValidationFailed>
    READER$ = (org.apache.avro.io.DatumReader<ValidationFailed>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}