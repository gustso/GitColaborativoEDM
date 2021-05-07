package ar.edu.unju.edm.model;

public class SamuelParedes {
    int edad;
    String nombre,apellido,profesion;
    public SamuelParedes() {}
    public SamuelParedes(int edad, String nombre, String apellido, String profesion) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
    }
    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * @return the profesion
     */
    public String getProfesion() {
        return profesion;
    }
    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "SamuelParedes [" + (apellido != null ? "apellido=" + apellido + ", " : "") + "edad=" + edad + ", "
                + (nombre != null ? "nombre=" + nombre + ", " : "")
                + (profesion != null ? "profesion=" + profesion : "") + "]";
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + edad;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((profesion == null) ? 0 : profesion.hashCode());
        return result;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SamuelParedes)) {
            return false;
        }
        SamuelParedes other = (SamuelParedes) obj;
        if (apellido == null) {
            if (other.apellido != null) {
                return false;
            }
        } else if (!apellido.equals(other.apellido)) {
            return false;
        }
        if (edad != other.edad) {
            return false;
        }
        if (nombre == null) {
            if (other.nombre != null) {
                return false;
            }
        } else if (!nombre.equals(other.nombre)) {
            return false;
        }
        if (profesion == null) {
            if (other.profesion != null) {
                return false;
            }
        } else if (!profesion.equals(other.profesion)) {
            return false;
        }
        return true;
    }
}
