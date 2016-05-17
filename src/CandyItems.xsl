<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:tns="http://www.example.org/Candy"
                xmlns:cmpl="http://www.example.org/ComplexTypes"
>

    <xsl:template match="/">
        <html>
            <head>Candies</head>
            <body>
                <table border="3">
                    <tr>
                        <td rowspan="2">id</td>
                        <td rowspan="2">Name</td>
                        <td rowspan="2">Production</td>
                        <td rowspan="2">Energy</td>
                        <td rowspan="1" colspan="4">Ingredients</td>
                        <td rowspan="1" colspan="3">Value</td>
                        <td rowspan="1" colspan="2">Type</td>
                    </tr>
                    <tr>
                        <td>water</td>
                        <td>sugar</td>
                        <td>fructosa</td>
                        <td>vanilin</td>

                        <td>proteins</td>
                        <td>carbohydrates</td>
                        <td>fats</td>

                        <td>kind</td>
                        <td>filling</td>
                    </tr>
                    <xsl:for-each select="tns:candy/tns:item">
                        <tr>
                            <td>
                                <xsl:value-of select="@id"/>
                            </td>
                            <td>
                                <xsl:value-of select="tns:name"/>
                            </td>
                            <td>
                                <xsl:value-of select="tns:production"/>
                            </td>
                            <td>
                                <xsl:value-of select="tns:energy"/>
                            </td>

                            <td>
                                <xsl:value-of select="tns:ingredients/cmpl:water"/>
                            </td>
                            <td>
                                <xsl:value-of select="tns:ingredients/cmpl:sugar"/>
                            </td>
                            <td>
                                <xsl:value-of select="tns:ingredients/cmpl:fructosa"/>
                            </td>
                            <td>
                                <xsl:value-of select="tns:ingredients/cmpl:vanilin"/>
                            </td>



                            <td>
                                <xsl:value-of select="tns:value/cmpl:proteins"/>
                            </td>
                            <td>
                                <xsl:value-of select="tns:value/cmpl:carbohydrates"/>
                            </td>
                            <td>
                                <xsl:value-of select="tns:value/cmpl:fats"/>
                            </td>


                            <td>
                                <xsl:value-of select="tns:type/cmpl:kind"/>
                            </td>
                            <td>
                                <xsl:choose>
                                    <xsl:when test="tns:type/cmpl:filling = 'true'">
                                        yes
                                    </xsl:when>
                                    <xsl:otherwise>
                                        no
                                    </xsl:otherwise>
                                </xsl:choose>
                            </td>




                        </tr>

                    </xsl:for-each>

                </table>

            </body>

        </html>


    </xsl:template>

</xsl:stylesheet>