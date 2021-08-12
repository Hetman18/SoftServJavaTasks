class EnvelopeAnalyse extends InPutEnvelopesParameters {
        private float sideA;
        private float sideB;
        private float sideC;
        private float sideD;

    EnvelopeAnalyse(){
        this.sideA = getEnvelopeSideA();
        this.sideB = getEnvelopeSideB();
        this.sideC = getEnvelopeSideC();
        this.sideD = getEnvelopeSideD();
    }
    void analyseEnvelopesNested(){
        String CDnestedAB = "Envelope CD can be nested to envelope AB!";
        String ABnestedCD = "Envelope AB can be nested to envelope CD!";
        if (sideA > sideC && sideA > sideD && sideB > sideC || sideB > sideD) {
            System.out.println(CDnestedAB);
        } else if (sideB > sideC && sideB > sideD && sideA > sideC || sideA > sideD){
            System.out.println(CDnestedAB);
        } else if (sideC > sideB && sideC > sideA && sideD > sideB || sideD > sideA){
            System.out.println(ABnestedCD);
        } else if (sideD > sideB && sideD > sideA && sideC > sideB || sideC > sideA) {
            System.out.println(ABnestedCD);
        } else {
            String envelopeCantBeNestedToAnother = "No one envelope can't be nested to another";
            System.out.println(envelopeCantBeNestedToAnother);
        }
        inPutValidStringParameters();
    }
}
