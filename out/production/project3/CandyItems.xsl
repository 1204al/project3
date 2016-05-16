<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <html>
            <head>Candies</head>
            <body>
                <table border="3">
                    <tr>
                        <td rowspan="2">Name</td>
                        <td rowspan="2">Production</td>
                        <td rowspan="2">Energy</td>
                        <td rowspan="1" colspan="4">Ingredients</td>
                        <td rowspan="1" colspan="3">Value</td>
                        <td rowspan="1" colspan="2">Type</td>
                    </tr>
                    <tr>
                        <th>water</th>
                        <th>sugar</th>
                        <th>fructosa</th>
                        <th>vanilin</th>

                        <th>proteins</th>
                        <th>carbohydrates</th>
                        <th>fats</th>

                        <th>kind</th>
                        <th>filling</th>
                    </tr>







                </table>

            </body>

        </html>


    </xsl:template>

</xsl:stylesheet>