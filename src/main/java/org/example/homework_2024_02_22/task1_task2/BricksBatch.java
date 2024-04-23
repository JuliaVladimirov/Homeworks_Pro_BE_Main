package org.example.homework_2024_02_22.task1_task2;

public class BricksBatch {

    private int batchNumber;

    private int quantityOfBricks;

    public BricksBatch(int batchNumber, int quantityOfBricks) {
        this.batchNumber = batchNumber;
        this.quantityOfBricks = quantityOfBricks;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    public int getQuantityOfBricks() {
        return quantityOfBricks;
    }

    public void setQuantityOfBricks(int quantityOfBricks) {
        this.quantityOfBricks = quantityOfBricks;
    }

    @Override
    public String toString() {
        return "\nПартия кирпичей{" +
                "номер=" + batchNumber +
                ", количество кирпичей=" + quantityOfBricks +
                '}';
    }
}
