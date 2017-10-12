package cl.ucn.disc.dam.discnews.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.time.LocalDateTime;

import lombok.Getter;

/**
 * Representa una Noticia en un instante de tiempo
 * para el sistema de DISC News
 *
 * @author Jean Cortes Taiba.
 */

public final class Noticia {

    /**
     * Descripción en una línea del título de la Noticia
     */
    @Getter
    private String titulo;

    /**
     * Descripción en 2 líneas y con un mácimo de 140 chars
     */
    @Getter
    private String resumen;

    /**
     * Contenido completo de la Noticia
     */
    @Getter
    private String contenido;

    /**
     * Fecha de la Noticia
     */
    @Getter
    private LocalDateTime fecha;

    /**
     * Icono de la Noticia 64x64 pixels
     */
    @Getter
    private String icono;

    /**
     * Autor de la Noticia en formato: "Jean Cortés <jeancortes.t@gmail.com>"
     */
    @Getter
    private String autor;

    /**
     * @return representación en formato String de Noticia
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
    }
}
