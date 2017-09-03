/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package it.cnr.isti.hpc.wikipedia.article;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AvroLink extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8180598190613883470L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroLink\",\"namespace\":\"it.cnr.isti.hpc.wikipedia.article\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String id;
  @Deprecated public java.lang.String description;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroLink() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param description The new value for description
   */
  public AvroLink(java.lang.String id, java.lang.String description) {
    this.id = id;
    this.description = description;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return description;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: description = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return The value of the 'description' field.
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /**
   * Creates a new AvroLink RecordBuilder.
   * @return A new AvroLink RecordBuilder
   */
  public static it.cnr.isti.hpc.wikipedia.article.AvroLink.Builder newBuilder() {
    return new it.cnr.isti.hpc.wikipedia.article.AvroLink.Builder();
  }

  /**
   * Creates a new AvroLink RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroLink RecordBuilder
   */
  public static it.cnr.isti.hpc.wikipedia.article.AvroLink.Builder newBuilder(it.cnr.isti.hpc.wikipedia.article.AvroLink.Builder other) {
    return new it.cnr.isti.hpc.wikipedia.article.AvroLink.Builder(other);
  }

  /**
   * Creates a new AvroLink RecordBuilder by copying an existing AvroLink instance.
   * @param other The existing instance to copy.
   * @return A new AvroLink RecordBuilder
   */
  public static it.cnr.isti.hpc.wikipedia.article.AvroLink.Builder newBuilder(it.cnr.isti.hpc.wikipedia.article.AvroLink other) {
    return new it.cnr.isti.hpc.wikipedia.article.AvroLink.Builder(other);
  }

  /**
   * RecordBuilder for AvroLink instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroLink>
    implements org.apache.avro.data.RecordBuilder<AvroLink> {

    private java.lang.String id;
    private java.lang.String description;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(it.cnr.isti.hpc.wikipedia.article.AvroLink.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AvroLink instance
     * @param other The existing instance to copy.
     */
    private Builder(it.cnr.isti.hpc.wikipedia.article.AvroLink other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.description)) {
        this.description = data().deepCopy(fields()[1].schema(), other.description);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.String getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public it.cnr.isti.hpc.wikipedia.article.AvroLink.Builder setId(java.lang.String value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public it.cnr.isti.hpc.wikipedia.article.AvroLink.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * @return The value.
      */
    public java.lang.String getDescription() {
      return description;
    }

    /**
      * Sets the value of the 'description' field.
      * @param value The value of 'description'.
      * @return This builder.
      */
    public it.cnr.isti.hpc.wikipedia.article.AvroLink.Builder setDescription(java.lang.String value) {
      validate(fields()[1], value);
      this.description = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'description' field.
      * @return This builder.
      */
    public it.cnr.isti.hpc.wikipedia.article.AvroLink.Builder clearDescription() {
      description = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public AvroLink build() {
      try {
        AvroLink record = new AvroLink();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.description = fieldSetFlags()[1] ? this.description : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
