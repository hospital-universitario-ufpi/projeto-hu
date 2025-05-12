package com.hu.backend.dto.areaCorporalAcometida;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "AreaCorporalAcometidaDto", description = "DTO de resposta com os dados da área corporal acometida vinculada a um tratamento.")
public record AreaCorporalAcometidaDto(

    @Schema(description = "ID do registro da área corporal acometida", example = "1")
    Long id,

    @Schema(description = "Porcentagem acometida na cabeça e pescoço (0-9%)", example = "4")
    Integer cabecaPescoco,

    @Schema(description = "Porcentagem acometida no braço direito (0-9%)", example = "3")
    Integer bracoDireito,

    @Schema(description = "Porcentagem acometida no braço esquerdo (0-9%)", example = "2")
    Integer bracoEsquerdo,

    @Schema(description = "Porcentagem acometida na perna direita (0-18%)", example = "10")
    Integer pernaDireita,

    @Schema(description = "Porcentagem acometida na perna esquerda (0-18%)", example = "12")
    Integer pernaEsquerda,

    @Schema(description = "Porcentagem acometida no tronco anterior (0-18%)", example = "6")
    Integer troncoAnterior,

    @Schema(description = "Porcentagem acometida no tronco posterior (0-18%)", example = "8")
    Integer troncoPosterior,

    @Schema(description = "Porcentagem acometida na genitália (0-1%)", example = "1")
    Integer genitalia

) {}
