package br.com.zup.pix

import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
class ChavePix(

    @field:NotNull
    val clienteId: UUID,

    @field:NotNull
    //Usada para mapear uma classe Enum
    @Enumerated(EnumType.STRING)
    val tipoChave: DesafioPixRequest.TipoChave,

    @field:NotBlank
    var chave: String,

    @field:NotNull
    @Enumerated(EnumType.STRING)
    val tipoConta: DesafioPixRequest.TipoConta,

){
    @Id
    @GeneratedValue
    val id: UUID? = null
}